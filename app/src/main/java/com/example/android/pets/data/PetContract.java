package com.example.android.pets.data;

import android.provider.BaseColumns;

/**
 * Created by AboSalaah on 2/12/2018.
 */

public final class PetContract {
     public static abstract class PetEntry implements BaseColumns {
         public static final String TABLE_NAME = "pets";
         public static final String COLUMN_PET_NAME = "name";
         public static final String COLUMN_PET_BREED = "breed";
         public static final String COLUMN_PET_GENDER = "gender";
         public static final String COLUMN_PET_WEIGHT = "weight";
         public static final String COLUMN_PET_ID = BaseColumns._ID;

         /**
          * possible values for the Gender of the Pet
          */
         public static final int GENDER_MALE=1;
         public static final int GENDER_FEMALE=2;
         public static final int GENDER_UNKNOWN=3;
     }
}
