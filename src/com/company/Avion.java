package com.company;

public abstract class Avion {
    protected int capacidad_de_combustible;
    protected int costo_km; //COSTO POR KILOMETRO
    protected int capacidad_de_pasajeros; //CAPACIDAD MAXIMA DE ESTE AVION
    protected Double velocidad_maxima; //VELOCIDAD EN KM/H
    protected  Propulsion propulsion; //TIPO DE PROPULSION DEL AVION
}
