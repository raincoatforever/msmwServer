package org.stocker.nseData;

import com.google.common.base.Strings;

import java.util.HashMap;
import java.util.Optional;

/**
 *  POJO representation for one row of NSE data obtained
 *  Example data row -
 *  INSTRUMENT,SYMBOL,EXPIRY_DT,STRIKE_PR,OPTION_TYP,OPEN,HIGH,LOW,CLOSE,SETTLE_PR,CONTRACTS,VAL_INLAKH,OPEN_INT,CHG_IN_OI,TIMESTAMP,
 */
public class NseDataObj {
    public HashMap<NseDataRow,String> rowData;

    public NseDataObj() {
        rowData = new HashMap<>();
    }

    public void deserialize(String stringData){
        if(Strings.isNullOrEmpty(stringData)){
            return;
        }

        String[] values = stringData.split(",");
        rowData.put(NseDataRow.INSTRUMENT, values[0]);
        rowData.put(NseDataRow.SYMBOL, values[1]);
        rowData.put(NseDataRow.EXPIRY_DT, values[2]);
        rowData.put(NseDataRow.STRIKE_PR, values[3]);
        rowData.put(NseDataRow.OPTION_TYP, values[4]);
        rowData.put(NseDataRow.OPEN, values[5]);
        rowData.put(NseDataRow.HIGH, values[6]);
        rowData.put(NseDataRow.LOW, values[7]);
        rowData.put(NseDataRow.CLOSE, values[8]);
        rowData.put(NseDataRow.SETTLE_PR, values[9]);
        rowData.put(NseDataRow.CONTRACTS, values[10]);
        rowData.put(NseDataRow.VAL_INLAKH, values[11]);
        rowData.put(NseDataRow.OPEN_INT, values[12]);
        rowData.put(NseDataRow.CHG_IN_OI, values[13]);
        rowData.put(NseDataRow.TIMESTAMP, values[14]);
    }
}
