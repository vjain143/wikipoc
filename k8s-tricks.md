# Find Pod name and store in a var in .bat file
```text
FOR /F "tokens=*" %%i IN ('kubectl get pods -o=name --namespace=<your_namespace>') DO SET PodName=%%i

@echo off
setlocal enabledelayedexpansion

set NAMESPACE=<your_namespace>
set LABEL_SELECTOR=<your_label_selector>

for /f "tokens=* USEBACKQ" %%F in (`kubectl get pods --namespace=!NAMESPACE! --selector=!LABEL_SELECTOR! -o jsonpath="{.items[0].metadata.name}"`) do (
    set PodName=%%F
    echo The name of the pod is: !PodName!
)

endlocal

```

