### Reference
```https://medium.com/@javatechie/deploying-a-spring-boot-application-on-aws-eks-fdd7d075f034```

First run command to build jar we can also build using dockerfile as well

``mvn clean install``

Command for building docker image
```
docker build -t <image-name> .
```

Command to delete image
``` 
docker rmi <image-name>
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
####  execute
```
minikube start
```
#### stop
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

---

### Run Kubernetes command
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

get nodes ip
```
kubectl get nodes -o wide
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

The Minikube service command creates a tunnel that allows you to access the service locally,
avoiding potential firewall or network configuration issues.
```
minikube service hankman-service
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










