# Find Pod name and store in a var in .bat file
```text
FOR /F "tokens=*" %%i IN ('kubectl get pods -o=name --namespace=<your_namespace>') DO SET PodName=%%i
```
