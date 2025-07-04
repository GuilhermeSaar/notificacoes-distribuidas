CREATE TABLE tb_notification_record (

    id UUID PRIMARY KEY,
    status VARCHAR(20) NOT NULL,
    id_notification UUID,


    FOREIGN KEY (id_notification) REFERENCES tb_notification(id)
);