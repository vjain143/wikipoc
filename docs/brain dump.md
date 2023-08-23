
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
