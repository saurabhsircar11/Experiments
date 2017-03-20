package com.example.root.mydownloadingfile;

import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Environment;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new DownloadRecordingTask().execute("Kamin", "Kamm",
                "Kampf", "Kampfgeist");

    }

    @NonNull
    private String getString() {
        return "https://cmportalvhds7yd40r6vd9ws.blob.core.windows" +
                ".net/word-recording/Woerter/";
    }

    public class DownloadRecordingTask extends AsyncTask<String, String, String> {
        private static final String RECORDING_CACHE = "RecordingCache";
        private static final String WAV_EXTENSION = ".wav";

        @Override
        protected String doInBackground(final String... params) {
            try {
                for (int i = 0; i < params.length; i++) {
                    FileUtils.copyURLToFile(new URL(getString() + params[i]+WAV_EXTENSION), cachedFile
                            (params[i]));
                }
            } catch (final IOException ioException) {
                ioException.printStackTrace();
            }
            return null;
        }


        @Override
        protected void onPostExecute(final String s) {
            Log.i("downloaded", "download");
        }

        private File cachedFile(final String param) {
            final File cacheRecording = new File(Environment.getExternalStorageDirectory(), RECORDING_CACHE);
            if (!cacheRecording.exists()) {
                cacheRecording.mkdirs();
            }
            return new File(cacheRecording, param + WAV_EXTENSION);
        }
    }
}
