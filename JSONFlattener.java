package com.wiki.flattener;

import java.util.Iterator;

public class JSONFlattener {
    public static void main(String[] args) {

        String json = "";
        JSONObject json = new JSONObject(json);

    }

    private static JSONObject flatten(JSONObject object, JSONObject flattened){
        if(flattened == null){
            flattened = new JSONObject();
        }
        Iterator<?> keys = object.keys();
        while(keys.hasNext()){
            String key = (String)keys.next();
            try {
                if(object.get(key) instanceof JSONObject){
                    flatten(object.getJSONObject(key), flattened);
                } else {
                    flattened.put(key, object.get(key));
                }
            } catch(JSONException e){
                System.out.println(e);
            }
        }
        return flattened;
    }
}
