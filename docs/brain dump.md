
apiVersion: apps/v1
kind: Deployment
metadata:
  name: xml-update-deployment
spec:
  replicas: 1
  selector:
    matchLabels:
      app: xml-update-app
  template:
    metadata:
      labels:
        app: xml-update-app
    spec:
      containers:
        - name: main-container
          image: your-image:tag
          # Other container settings...

      initContainers:
        - name: xml-update-init
          image: busybox:latest
          command: ["/bin/sh", "-c"]
          args:
            - |
              # Use sed to update the XML file
              sed -i "s|<old_value>|$ENV_VARIABLE_VALUE|g" /path/to/xml/file.xml
          env:
            - name: ENV_VARIABLE_VALUE
              value: new_value

      # Other pod settings...


      ExecStart=/bin/bash -c '${TRINO_HOME}/bin/launcher start --pid-file ${TRINO_PID_DIR}/trino-server.pid --launcher-config ${TRINO_HOME}/bin/launcher.properties --node-config ${TRINO_CONF_DIR}/node.properties --jvm-config ${TRINO_CONF_DIR}/jvm.config --config ${TRINO_CONF_DIR}/config.properties --launcher-log-file ${TRINO_LOG}/launcher.log --

echo -n YourStringHere | powershell -command "[Convert]::ToBase64String([System.Text.Encoding]::UTF8.GetBytes($input))"
