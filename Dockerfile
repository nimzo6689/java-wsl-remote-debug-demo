# 開発用Dockerfile
FROM eclipse-temurin:21

# 開発ツールのインストール
RUN apt-get update && \
    apt-get install -y maven inotify-tools && \
    rm -rf /var/lib/apt/lists/*

WORKDIR /app

# 開発用スクリプト
RUN <<EOF cat > /app/dev.sh
#!/bin/sh
while true; do
  mvn compile
  if [ \$? -eq 0 ]; then
    java -agentlib:jdwp=transport=dt_socket,server=y,suspend=y,address=*:5005 -cp target/classes com.example.Main
  fi
  inotifywait -e modify -e create -e delete -r ./src
done
EOF

RUN chmod +x /app/dev.sh

CMD ["/app/dev.sh"]
