# mvn clean install
docker build -t client-service . 
docker tag client-service arunkumarshahi/client-service 
docker push arunkumarshahi/client-service
### client-service
kubectl delete configmap client-service
kubectl delete -f client-service-deployment.yaml

kubectl create -f client-config.yaml
kubectl create -f client-service-deployment.yaml

# Check that the pods are running
kubectl get pods
