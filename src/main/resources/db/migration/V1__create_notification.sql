CREATE TABLE tb_notification (

    id UUID PRIMARY KEY,
    notification_type VARCHAR(10) NOT NULL,
    recipient VARCHAR(10) NOT NULL,
    title VARCHAR(50) NOT NULL,
    text_content TEXT NOT NULL
);

