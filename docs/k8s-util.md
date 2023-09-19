# List Container CPU and Memory Requests/Limits for Each Pod:
'''
for pod in $(kubectl get pods -n <namespace> -o jsonpath='{.items[*].metadata.name}'); do
    echo "Pod: $pod"
    kubectl get pod $pod -n <namespace> -o jsonpath='{.spec.containers[*].name}'; echo
    kubectl get pod $pod -n <namespace -o jsonpath='{range .spec.containers[*]}{.name}: CPU Requests: {.resources.requests.cpu}, Memory Requests: {.resources.requests.memory}, CPU Limits: {.resources.limits.cpu}, Memory Limits: {.resources.limits.memory}{"\n"}{end}'
    echo "--------------------"
done
'''
