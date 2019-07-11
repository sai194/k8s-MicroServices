# k8s-MicroServices

docker build -t sai194/employee-app .

docker build --no-cache -t sai194/employee-app .

docker push sai194/employee-app

docker build -t sai194/department-app .

docker build --no-cache -t sai194/department-app .

docker push sai194/department-app


docker build -t sai194/ubuntuwithjdk .

docker build -t sai194/ubuntuwithjdkandmaven .

kubectl apply -f k8s-deploy-svc.yml

git clone https://github.com/sai194/k8s-MicroServices.git<repo>
  
kubectl version
kubectl  apply -f  k8s-deploy-svc-gke.yml
kubectl get pods
