# List Container CPU and Memory Requests/Limits for Each Pod:
'''
for pod in $(kubectl get pods -n <namespace> -o jsonpath='{.items[*].metadata.name}'); do
    echo "Pod: $pod"
    kubectl get pod $pod -n <namespace> -o jsonpath='{.spec.containers[*].name}'; echo
    kubectl get pod $pod -n <namespace -o jsonpath='{range .spec.containers[*]}{.name}: CPU Requests: {.resources.requests.cpu}, Memory Requests: {.resources.requests.memory}, CPU Limits: {.resources.limits.cpu}, Memory Limits: {.resources.limits.memory}{"\n"}{end}'
    echo "--------------------"
done
'''


#!/bin/bash

# Specify the Kubernetes namespace you want to list pods for
namespace="your_namespace_here"

# Use kubectl to get the list of pods in the specified namespace
pod_list=$(kubectl get pods -n "$namespace" --output=jsonpath='{range .items[*]}{.metadata.name}{"\n"}{end}')

# Iterate over each pod
IFS=$'\n' read -r -a pod_array <<< "$pod_list"
for pod_name in "${pod_array[@]}"
do
    echo "Pod Name: $pod_name"

    # Get container names for the pod
    container_names=$(kubectl get pods "$pod_name" -n "$namespace" -o jsonpath='{.spec.containers[*].name}')

    # Iterate over each container in the pod
    IFS=' ' read -r -a container_array <<< "$container_names"
    for container_name in "${container_array[@]}"
    do
        echo "  Container Name: $container_name"

        # Get memory limit for the container
        memory_limit=$(kubectl get pod "$pod_name" -n "$namespace" -o jsonpath="{.spec.containers[?(@.name=='$container_name')].resources.limits.memory}")
        echo "  Memory Limit: $memory_limit"

        # Get CPU limit for the container
        cpu_limit=$(kubectl get pod "$pod_name" -n "$namespace" -o jsonpath="{.spec.containers[?(@.name=='$container_name')].resources.limits.cpu}")
        echo "  CPU Limit: $cpu_limit"
    done

    echo "---"
done
