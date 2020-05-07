docker run -d --name vault --cap-add=IPC_LOCK -e 'VAULT_DEV_ROOT_TOKEN_ID=spring-cloud' -p 8200:8200 vault
docker run -d --name=consul -e CONSUL_BIND_INTERFACE=eth0 -p 8500:8500 consul

callme-service
caller-service
consul - config server, service registry