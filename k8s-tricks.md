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



@echo off
setlocal enabledelayedexpansion

set "InputString=part1|part2"
set "Delimiter=|"

for /f "tokens=1,2 delims=!Delimiter!" %%a in ("!InputString!") do (
    set "Part1=%%a"
    set "Part2=%%b"
)

echo First Part: !Part1!
echo Second Part: !Part2!

endlocal


```

