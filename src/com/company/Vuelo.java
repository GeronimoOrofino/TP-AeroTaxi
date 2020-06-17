package com.company;

import java.util.Date;

public class Vuelo {

    private Date fecha_de_vuelo; //FECHA EN LA QUE SE REALIZA EL VUELO
    private Usuario usuario; //USUARIO QUE CONTRATO EL VUELO
    private Ciudad origen;
    private Ciudad destino;
    private int cantidad_de_pasajeros; //CANTIDAD DE PASAJEROS DE ESTE VUELO
    private Avion avion_asignado; //AVION ASIGNADO A ESTE VUELO
}
