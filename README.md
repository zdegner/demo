Ensure redis is running somewhere and accessible to K8S (set to redis://host.docker.internal:6379 by default in the config file)

Run the following:

```
./gradlew jibDockerBuild
kubectl apply -f k8s.yml
```

Cleanup:

```
kubectl delete deployment demo
kubectl delete service demo
```

Wait about 30 minutes and check the number of connections in Redis:
```
redis> client list
```
