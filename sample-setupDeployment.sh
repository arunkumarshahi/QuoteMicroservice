#sudo minikube delete
#sudo minikube start

cd spring-feign-kubernetes

cd hello-service
#mvn clean package

#cd hello-service
#docker build -t nhatthai/hello-service .

sudo kubectl delete -f manifests/hello-service-configmap.yml
sudo kubectl delete -f manifests/hello-service.yml
#sudo kubectl create -f manifests/hello-service-configmap.yml
#sudo kubectl create -f manifests/hello-service.yml

cd ..
cd client-service
#mvn clean package

#docker build -t nhatthai/client-service .

sudo kubectl delete -f manifests/client-service-configmap.yaml
sudo kubectl delete -f manifests/client-service.yml


#sudo kubectl create -f manifests/client-service-configmap.yml
#sudo kubectl create -f manifests/client-service.yml

#sudo minikube dashboard
