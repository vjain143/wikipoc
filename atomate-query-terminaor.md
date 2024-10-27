To build an automated function to kill queries that exceed specified resource thresholds in Trino, you can use Trino’s API to monitor and terminate queries that are consuming too many resources. Here’s a step-by-step approach to set this up:

1. Define Thresholds for Killing Queries

	•	Set the criteria for what constitutes a resource-heavy or “harmful” query. Some common metrics and thresholds to consider:
	•	CPU Usage: Maximum CPU time allowed per query.
	•	Memory Usage: Maximum memory allocation allowed per query.
	•	Execution Time: Maximum allowed query runtime.
	•	Example thresholds:
	•	cpuTime > 2 minutes
	•	memoryReservation > 10GB
	•	elapsedTime > 5 minutes

2. Create a Script to Monitor Queries Using Trino’s API

	•	Trino exposes query information through its API, where you can monitor active queries and their metrics:
	•	Endpoint: /v1/query
	•	This endpoint provides details on each active query, including memory usage, CPU time, and query state.
	•	You can use a scripting language like Python to poll this endpoint and check for queries that exceed your thresholds.

Example Python Script:

import requests
import time

# Trino API and authentication details
TRINO_HOST = 'http://your-trino-host:8080'
API_URL = f"{TRINO_HOST}/v1/query"
KILL_URL = f"{TRINO_HOST}/v1/query/kill"
HEADERS = {'Content-Type': 'application/json'}

# Thresholds (customize as needed)
MAX_CPU_TIME = 120  # in seconds
MAX_MEMORY = 10 * 1024 * 1024 * 1024  # 10GB in bytes
MAX_ELAPSED_TIME = 300  # in seconds (5 minutes)

def get_queries():
    response = requests.get(API_URL)
    return response.json()

def kill_query(query_id):
    print(f"Killing query {query_id}")
    requests.delete(f"{KILL_URL}/{query_id}", headers=HEADERS)

def monitor_queries():
    while True:
        queries = get_queries()
        for query in queries:
            query_id = query['queryId']
            cpu_time = query.get('queryStats', {}).get('cpuTimeMillis', 0) / 1000  # convert to seconds
            memory = query.get('memoryReservation', 0)
            elapsed_time = query.get('elapsedTimeMillis', 0) / 1000  # convert to seconds

            if cpu_time > MAX_CPU_TIME or memory > MAX_MEMORY or elapsed_time > MAX_ELAPSED_TIME:
                kill_query(query_id)

        time.sleep(30)  # Poll every 30 seconds

if __name__ == "__main__":
    monitor_queries()

3. Deploy the Script as a Service

	•	Run the script in the background or deploy it as a service on your server so that it continuously monitors queries. You can use systemd on Linux to create a persistent service for the script:
	•	Create a new service file: /etc/systemd/system/trino-kill-query.service

[Unit]
Description=Automated Trino Query Killer

[Service]
ExecStart=/usr/bin/python3 /path/to/your_script.py
Restart=always

[Install]
WantedBy=multi-user.target


	•	Start and enable the service:

sudo systemctl start trino-kill-query.service
sudo systemctl enable trino-kill-query.service



4. Configure Logging and Alerts (Optional)

	•	Implement logging to keep a record of killed queries for audit purposes.
	•	Integrate with alerting tools like Slack or email notifications to get notified whenever a query is killed. You can use libraries like smtplib in Python for email or the Slack API for Slack notifications.

5. Testing and Fine-Tuning

	•	Test the script in a development environment to ensure it behaves as expected.
	•	Fine-tune your thresholds based on actual workloads and resource capacity.

6. Alternative: Use Resource Groups for More Granular Control

	•	Trino’s resource groups feature allows you to define policies for query concurrency and memory limits, which can help prevent problematic queries from running in the first place.
	•	Resource groups are defined in the resource-groups.properties file, and you can set different thresholds for different user roles, query types, or workloads.

This setup gives you an automated, proactive approach to preventing resource-heavy queries from overwhelming your Trino environment. Regularly reviewing query logs and adjusting thresholds will help you keep Trino stable and responsive.