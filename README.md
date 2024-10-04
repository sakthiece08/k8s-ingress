# k8s-ingress

### Commands executed 

```
docker build -t sakthiece08/product-api:1.0 .
docker build -t sakthiece08/promotion-api:1.0 .
docker images
docker push sakthiece08/product-api:1.0
docker push sakthiece08/promotion-api:1.0
docker run -p 8080:8080 sakthiece08/product-api:1.0
docker run -p 8080:8080 sakthiece08/promotion-api:1.0
```
### Minikube
```
minikube start --driver="docker"
minikube addons enable ingress
minikube status
```
Note: If Ingress controller is not available during Minikube startup then run above addons 
command to enable ingress

### How to generate Docker images?
```shell
$ git clone https://github.com/sakthiece08/k8s-ingress.git
$ cd k8s-ingress/product-api

$ ./mvnw clean install
$ docker build -t <<your_github_username>>/product-api:1.0 .

$ cd k8s-ingress/promotion-api
$ ./mvnw clean install
$ docker build -t <<your_github_username>>/promotion-api:1.0 .
```

### Deployment

* Setting up Kubernetes Kind Cluster.
  ```
   cd /kind
   chmod +x create-cluster.sh 
   ./create-cluster.sh
  ```
* Deploy app on Kubernetes
  ```
   cd /k8s
   kubectl apply -f . 
  ```
* Install Kubernetes Lens GUI tool - https://k8slens.dev/
