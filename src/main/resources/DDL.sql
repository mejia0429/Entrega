-- Crear la base de datos
CREATE DATABASE banco;

-- Conectarse a la base de datos
USE banco;

-- Crear la tabla de cuentas
CREATE TABLE cuentas (
    id SERIAL PRIMARY KEY,
    numero_cuenta VARCHAR(20) NOT NULL,
    saldo DECIMAL(10, 2) NOT NULL
);

-- Insertar datos de muestra en la tabla de cuentas
INSERT INTO cuentas (numero_cuenta, saldo) VALUES
    ('123456789', 1000.00),
    ('987654321', 2500.00);

-- Crear la tabla de transferencias
CREATE TABLE transferencias (
    id SERIAL PRIMARY KEY,
    cuenta_origen_id INTEGER REFERENCES cuentas(id),
    cuenta_destino_id INTEGER REFERENCES cuentas(id),
    monto DECIMAL(10, 2) NOT NULL,
    fecha_transferencia TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

-- Insertar una transferencia de muestra
INSERT INTO transferencias (cuenta_origen_id, cuenta_destino_id, monto) VALUES
    (1, 2, 500.00);