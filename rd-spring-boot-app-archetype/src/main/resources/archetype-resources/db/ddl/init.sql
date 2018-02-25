CREATE DATABASE IF NOT EXISTS ${mainArtifactId} DEFAULT CHARSET utf8 COLLATE utf8_general_ci;

CREATE USER ${mainArtifactId} IDENTIFIED BY '${mainArtifactId}1213';
CREATE USER ${mainArtifactId}@localhost IDENTIFIED BY '${mainArtifactId}1213';

GRANT ALL ON ${mainArtifactId}.* TO ${mainArtifactId};
GRANT ALL ON ${mainArtifactId}.* TO ${mainArtifactId}@localhost;

FLUSH PRIVILEGES;