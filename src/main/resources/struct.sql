CREATE TABLE properties
(
  id           INT AUTO_INCREMENT PRIMARY KEY,
  application  VARCHAR(32) DEFAULT 'default'              NOT NULL,
  profile      VARCHAR(32) DEFAULT 'dev'                  NOT NULL,
  label        VARCHAR(32) DEFAULT 'master'               NOT NULL,
  config_key   VARCHAR(512)                               NOT NULL,
  config_value VARCHAR(1024)                              NULL
)
  DEFAULT CHARSET utf8;