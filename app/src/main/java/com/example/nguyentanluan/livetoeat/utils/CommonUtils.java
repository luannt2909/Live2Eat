package com.example.nguyentanluan.livetoeat.utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.text.DecimalFormat;
import java.util.Date;

/**
 * Created by Nguyen Tan Luan on 3/18/2017.
 */

public class CommonUtils {
    public static final int PLAY_SERVICES_RESOLUTION_REQUEST = 9000;

    public static Gson getGson() {
        return new GsonBuilder().setDateFormat(AppConstants.DateFormatter.SERVER_FORMAT).disableHtmlEscaping().create();
    }

   /* public static StringEntity getEntity(String requestBody) throws UnsupportedEncodingException {
        String json = "{\"DTO\":" + requestBody + "}";
        StringEntity stringEntity;
        stringEntity = new StringEntity(json, "UTF-8");

        return stringEntity;
    }*/

    public static boolean isEmailValid(String email) {
        if (TextUtils.isEmpty(email)) {
            return true;
        }
        return android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches();
    }

    /**
     * Check the device to make sure it has the Google Play Services APK. If
     * it doesn't, display a dialog that allows users to download the APK from
     * the Google Play Store or enable it in the device's system settings.
     */
    public static boolean checkPlayServices(Activity activity) {
        GoogleApiAvailability apiAvailability = GoogleApiAvailability.getInstance();
        int resultCode = apiAvailability.isGooglePlayServicesAvailable(activity);
        if (resultCode != ConnectionResult.SUCCESS) {
            if (apiAvailability.isUserResolvableError(resultCode)) {
                apiAvailability.getErrorDialog(activity, resultCode, PLAY_SERVICES_RESOLUTION_REQUEST)
                        .show();
            }
            return false;
        }
        return true;
    }

    //check null for empty date string "0001-01-01T00:00:00+00:00"
    public static boolean isDateNull(Date date) {
        return (date.getYear() == -1899 && date.getMonth() == 0 && date.getDay() == 6);
    }

    public static Spanned getHtmlDecimalFormatted(double number, String unit) {
        DecimalFormat format = new DecimalFormat("#,###.#");
        return Html.fromHtml(format.format(number) + "<small>" + unit + "</small>");
    }

    public static void makePhoneCall(Context context, String phoneNumber) {
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:" + phoneNumber));
        context.startActivity(intent);
    }
}
