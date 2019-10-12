# springboot-elk
springboot + ELK + file-beat

Step-1: Download the elasticsearch fron below url:
hhttps://www.elastic.co/downloads/

Unzip and go to the bin directory and run ./elasticsearch in (linux terminal) for windows run the elasticsearch.bat file from same directory. Check the elasticsearch is up and running.
http://localhost:9200/

Step-2: download the kibana from below url;
https://www.elastic.co/downloads/
Unzip and go  to the config directory and uncomment the url 
# The URLs of the Elasticsearch instances to use for all your queries.
elasticsearch.hosts: ["http://localhost:9200"]
Now, go to the bin directory and eun ./kibana file in case of windows run kibana.bat file from same directory. check the kibana is up and running on below url:
http://localhost:5601/

Step-3:download the logstash from below url:
https://www.elastic.co/downloads/
Unzip and go the bin directory and reate a configuration file named logstash.conf with below details
# Sample Logstash configuration for creating a simple
# Beats -> Logstash -> Elasticsearch pipeline.
-----------------Start here--------------------------------
input {
  beats {
    port => 5044
  }
}

output {
  elasticsearch {
    hosts => ["http://localhost:9200"]
    index => "elastic"
    #user => "elastic"
    #password => "changeme"
  }
}
------------------End here-------------------------------
Now go to the bin directory and eun the ./logstash.bat -f logstash.conf in case of windows run the logstash.bat -f logstash.conf

Step-4: download the filebeat from below url:
https://www.elastic.co/downloads/
Please change filebeat.yml file as file shared in above repository
Now, go to the base filebeat folder and run ./filebeat -c filebeat.yml incase of windows just run filebeat -c filebeat.yml

Now, everything in done. go to the kibana http://localhost:5601/ goto the index pattern and create an index as you mentioned in logstah.conf inside bin folder in case of this url index is "elastic" and click on discover icon. and all the logs with display here.
