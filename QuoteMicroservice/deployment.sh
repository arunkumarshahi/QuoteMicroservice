

docker build -t quote-demo .  
docker tag quote-demo arunkumarshahi/quote-demo
docker push arunkumarshahi/quote-demo

sudo kubectl delete -f secret.yaml
sudo kubectl delete -f mongo-deployment.yaml
sudo kubectl delete -f quote-deployment.yaml

sudo kubectl create -f secret.yaml
sudo kubectl  create -f mongo-deployment.yaml
sudo kubectl   create -f quote-deployment.yaml

kubectl get svc
kubectl get pods
kubectl get deployment
