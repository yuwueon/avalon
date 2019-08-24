echo "start register"
nohup java -jar avalon-register/target/avalon-register.jar & 

sleep 1

echo "start account service";
nohup java -jar avalon-account-service/target/avalon-account-service.jar &


sleep 1

echo "start product service";
nohup java -jar avalon-product-service/target/avalon-product-service.jar &


sleep 1

echo "start app";
nohup java -jar avalon-app/target/avalon-app.jar &


sleep 1

echo "start gateway";
nohup java -jar avalon-gateway/target/avalon-gateway.jar &