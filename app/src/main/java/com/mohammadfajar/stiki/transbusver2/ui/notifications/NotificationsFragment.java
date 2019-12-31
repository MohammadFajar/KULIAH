package com.mohammadfajar.stiki.transbusver2.ui.notifications;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.preference.PreferenceFragmentCompat;

import com.mohammadfajar.stiki.transbusver2.ProfileActivity;
import com.mohammadfajar.stiki.transbusver2.R;
import android.os.Bundle;

public class NotificationsFragment extends Fragment {
    ListView lv;
    String[] bangundatar = new String[]{"Belajar Android",
            "Belajar iPhone",
            "Belajar Blackberry",
            "Belajar Brew",
            "Belajar WinPhone 7",
            "Belajar GPS",
            "Belajar Nafas",
            "Belajar Jalan",
            "Belajar Matematika",
            "Belajar Minum",
            "Belajar Naik Sepeda",
            "Belajar Nyetir Mobil",
            "Belajar Ngoding",
            "Belajar Membaca",
            "Belajar Accelerometer",
            "hasil 2+5 adalah"};


    private NotificationsViewModel notificationsViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        notificationsViewModel =
                ViewModelProviders.of(this).get(NotificationsViewModel.class);
        View root = inflater.inflate(R.layout.settings_activity, container, false);
//        ArrayAdapter<String> adapter = new ArrayAdapter<String>(inflater.getContext(),android.R.layout.simple_list_item_1);
        getChildFragmentManager()
                .beginTransaction()
                .replace(R.id.settings, new SettingsFragment())
                .commit();

        return root;
    }
    public static class SettingsFragment extends PreferenceFragmentCompat {
        @Override
        public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
            setPreferencesFromResource(R.xml.root_preferences, rootKey);
        }
    }
}