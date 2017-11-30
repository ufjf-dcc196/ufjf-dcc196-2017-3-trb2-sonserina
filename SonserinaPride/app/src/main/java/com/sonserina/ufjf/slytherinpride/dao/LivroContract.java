package com.sonserina.ufjf.slytherinpride.dao;

import android.provider.BaseColumns;

/**
 * Created by thassya on 28/11/17.
 */

public class LivroContract {
    public static final String TYPE_TEXT= " VARCHAR ";
    public static final String TYPE_INT = " INTEGER ";
    public static final String TYPE_DATE = "DATE";
    public static final String SEP = ", ";

    public static class Livro implements BaseColumns {
        public static final String TABLE_NAME = "livro";
        public static final String COLUMN_NAME_TITULO = "titulo";
        public static final String COLUMN_NAME_EDITORA = "editora";
        public static final String COLUMN_NAME_ANO = "ano";

        public static final String SQL_CREATE_LIVRO = "CREATE TABLE " + TABLE_NAME + "(" +
                _ID + TYPE_INT +  " PRIMARY KEY AUTOINCREMENT" + SEP +
                COLUMN_NAME_TITULO + TYPE_TEXT+ SEP +
                COLUMN_NAME_EDITORA + TYPE_TEXT+ SEP +
                COLUMN_NAME_ANO + TYPE_INT + ")";

        public static final String SQL_DROP_LIVRO = "DROP TABLE IF EXISTS " + TABLE_NAME;
    }

    public LivroContract() {
    }


}
