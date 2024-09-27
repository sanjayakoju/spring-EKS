### Reference
```
https://medium.com/@javatechie/deploying-a-spring-boot-application-on-aws-eks-fdd7d075f034
```

First run command to build jar we can also build using dockerfile as well

``mvn clean install``

### Docker
Command for building docker image
```
docker build -t <image-name> .
```
```
docker ps
```
```
docker images
```
```
docker image ls
```
```
docker image history <image-name>  
```

Command to delete image
``` 
docker rmi <image-name>
```
``` 
docker rmi -f <image-name>
```

Command to run docker image
```
docker run -d <image-name>
```

-p: Map a port on your local machine to a port in the container. For example, to map port 8080 on your machine to port 8080 in the container:
```
docker run -d -p 8080:8080 <image-name>
```
```
docker ps
```
``
docker log <container-id>
``
Command to stop running image
```
docker stop <conatainer-id> 3digits enough
```
```
docker stop <image-name>
```

#### Alternative
```
docker kill <container-name>
```

Kubernetes Mac Os brew install command
* brew install helm
* brew install kubectl
* brew install minikube
* brew install helm

### Run Minikube
execute
```
minikube start
```

stop
```
minikube stop
```

check status
```
minikube status
```

check ip
```
minikube ip
```

delete cluster
```
minikube delete
```

```
minikube profile list
```

```
minikube dashboard
```

load image
```
minikube image load <image-name: springboot-eks:latest> 
```

Allowing minikube to read our docker repository
```
eval $(minikube docker-env)
```

By default minikube come with ingress but we need to enabled
```
minikube addons enable ingress
```

The Minikube service command creates a tunnel that allows you to access the service locally,
avoiding potential firewall or network configuration issues.
```
minikube service springapp-service
```
-- Use the second URL

---

### Run Kubernetes command

To verify cluster
```
 kubectl cluster-info
```

configure kubectl
```
kubectl config use-context minikube
```

verify installation
```
kubectl get nodes
```

execute
```
kubectl apply -f hankman-service.yml 
```

delete
```
kubectl delete service hankman-service
```

get pods to monitor the status of the instances
```
kubectl get pods
``` 

get services
```
kubeclt get services
```

get logs
```
kubectl logs -l app=hankman
 ```

rollout restart
```
kubectl rollout restart deployment <springapp-deployment>
```

get nodes ip
```
kubectl get nodes -o wide
```

```
kubectl get all
```

delete all service
```
kubectl delete services --all
```

set replicas through command
```
kubectl scale deployment my-app --replicas=5
```

To see log
```
kubectl logs <pod-name>
```

Expose
```
kubectl exec -it <name: mysql-server-646ff99fd-p7kfb> /bin/bash
```

run secret map and config map before service
```
kubectl apply -f <file name>
```

```
kubectl get secrets 
```

```
kubectl get configmap
```

The Minikube service command creates a tunnel that allows you to access the service locally,
avoiding potential firewall or network configuration issues.
```
minikube service springapp-service
```
-- Use the second URL

---

### Helm
Note: To run helm we need to run minikube

To create helm chart
```
helm create <app-name-chart>
```

List helm
```
helm list
```

Install chart
```
helm install myapp-chart spring-app-chart 
```

Uninstall chart
``` 
helm uninstall myapp-chart
```

To access the proxy URL
```
minikube service myapp-chart-spring-app-chart --url
```

---

### Jenkins
Reference url: 
```
https://www.youtube.com/watch?v=mszE-OCI2V4&list=PLVz2XdJiJQxzMiFDnwxUDxmuZQU3igcBb&index=5
```

Install jenkins
```
brew install jenkins-lts
```

Run jenkins
```
brew services start jenkins-lts
```
Restart jenkins
```
sudo brew services restart jenkins-lts
```
Stop 
```
brew services stop jenkins-lts
```

Jenkins password
```
cat /Users/sanjayakoju/.jenkins/secrets/initialAdminPassword
```

--

### Encryption

```
echo -n 'value you want to encrypt' | base64
```

---
### kafka

To start kafka though docker compose
```
sudo docker compose -f kafka-compose.yaml up -d  
```











