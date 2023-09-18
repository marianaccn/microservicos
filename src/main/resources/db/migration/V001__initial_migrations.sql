CREATE TABLE bills
(
    id              UUID        PRIMARY KEY,
    title           TEXT           NOT NULL,
    description     TEXT               NULL,
    price           BIGINT         NOT NULL,
    reference_date  TIMESTAMP      NOT NULL,
    payment_date    TIMESTAMP          NULL,
    receipt         TEXT               NULL,
    created_at      TIMESTAMP      NOT NULL,
    modified_at     TIMESTAMP      NOT NULL
);

CREATE TABLE donations
(
    id              UUID        PRIMARY KEY,
    title           TEXT           NOT NULL,
    description     TEXT               NULL,
    price           BIGINT         NOT NULL,
    reference_date  TIMESTAMP      NOT NULL,
    payment_date    TIMESTAMP          NULL,
    receipt         TEXT               NULL,
    created_at      TIMESTAMP      NOT NULL,
    modified_at     TIMESTAMP      NOT NULL
);