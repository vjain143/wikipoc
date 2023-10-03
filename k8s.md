# Filter ReplicaSets with Desired Replica Count 0

kubectl get replicasets --all-namespaces -o=jsonpath='{range .items[?(@.spec.replicas==0)]}{"\n"}{.metadata.namespace}/{.metadata.name}: {.spec.replicas}{"\n"}'

# Filter and delete replicaSets with Desired Replica Count 0

kubectl get replicasets --all-namespaces -o=jsonpath='{range .items[?(@.spec.replicas==0)]}{.metadata.namespace}/{.metadata.name}{"\n"}' | xargs -I {} sh -c 'kubectl delete replicasets -n $0 $1' {}

