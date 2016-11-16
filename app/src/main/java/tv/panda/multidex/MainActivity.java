package tv.panda.multidex;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.common.collect.BiMap;

import java.util.Map;
import java.util.Set;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Guava dependency
        BiMap biMap = new BiMap() {
            @Nullable
            @Override
            public Object put(Object key, Object value) {
                return null;
            }

            @Nullable
            @Override
            public Object forcePut(Object key, Object value) {
                return null;
            }

            @Override
            public void putAll(Map map) {

            }

            @Override
            public Set values() {
                return null;
            }

            @Override
            public BiMap inverse() {
                return null;
            }

            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean containsKey(Object o) {
                return false;
            }

            @Override
            public boolean containsValue(Object o) {
                return false;
            }

            @Override
            public Object get(Object o) {
                return null;
            }

            @Override
            public Object remove(Object o) {
                return null;
            }

            @Override
            public void clear() {

            }

            @NonNull
            @Override
            public Set keySet() {
                return null;
            }

            @NonNull
            @Override
            public Set<Entry> entrySet() {
                return null;
            }
        };
    }
}
