CREATE DATABASE IF NOT EXISTS ${artifactId} DEFAULT CHARSET utf8 COLLATE utf8_general_ci;

CREATE USER ${artifactId} IDENTIFIED BY '${artifactId}1213';
CREATE USER ${artifactId}@localhost IDENTIFIED BY '${artifactId}1213';

GRANT ALL ON ${artifactId}.* TO ${artifactId};
GRANT ALL ON ${artifactId}.* TO ${artifactId}@localhost;

FLUSH PRIVILEGES;