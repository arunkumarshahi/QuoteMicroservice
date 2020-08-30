sudo minikube delete
sudo minikube start

cd nginx-controller-ingress
sudo ./startup.sh
cd ..
cd QuoteMicroservice-client
sudo mvn clean install
sudo ./deployment-service-client.sh
cd ..
cd QuoteMicroservice
sudo mvn clean install
sudo ./deployment.sh
cd ..
sudo minikube dashboard

##http://192.168.99.100:30083/client/proxy/5f4b19ff77e7490d56e05af4
