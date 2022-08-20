package com.aplicacion.examenparcial3.configuraciones;

public class Transacciones {
    //Nombre de la base de datos
    public static final String NameDatabase = "PM01DB";

    /*TABLA PAISES*/
    public static String tblMedicamentos = "medic";
    public static final String p_medic="tiempo";
    public static final String p_codigo="codigo";
    public static final String CreateTableTiempo = "CREATE TABLE " + tblMedicamentos + "(codigo INTEGER PRIMARY KEY,"+"medic TEXT )";
    public static final String DropTableTiempo = "DROP TABLE " + tblMedicamentos;

    //Creacion de las tablas de la base de datos
    public static final String tablaMedicament = "contactos";
       //Creacion de los atributos
        public static final String id = "id";
        public static final String descripcion = "descripcion";
        public static final int cantidad = 0;
        public static final String tiempo = "tiempo";
        public static final String periocidad = "periocidad";





        //Transacciones DDL
        public static final String createMedicament = "CREATE TABLE " + tablaMedicament +
                "(id INTEGER PRIMARY KEY AUTOINCREMENT," +
                "descripcion TEXT, cantidad INTEGER, tiempo TEXT, foto BLOB, periocidad TEXT)";

        public static final String dropTableMedic = "DROP TABLE IF EXIST" + tablaMedicament;
}
