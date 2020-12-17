package com.kp.test;


import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.regex.Pattern;


public interface AppConstants {
    /**
     * Application(Project) id on Google api(Developer) Console
     */





    String BASE_URL = "";
    static final String SIGN_UP= "user";
    static final String SIGN_IN= "user-login";

    /**
     * Messages for user interaction
     */
    String SHOW_ERROR = "-1", HIDE_ERROR = "-1", SUCCESS_1 = "1", SUCCESS_0 = "0", SUCCESS_TRUE = "true", SUCCESS_UNKNOWN = "Whoops! Unknown sucess value";
    String WORK_IN_PROGRESS = "WORK IN PROGRESS";
    String UNEXPEXTED_ERROR = "Whoops! Something is happen unexpectedly. Please try again.";
    String UNEXPECTED_RESPONSE = "Whoops! Something is happen unexpectedly. Response is not in proper format.";
    String PARSING_ERROR = "Whoops! Something is happen unexpectedly. Exception in data parsing.";
    String EXCEPTION = "Whoops! Something is happen unexpectedly. Exception in data processing.";
    int DARK = 1;
    int LIGHT = 2;


    //for Local
    //String BASE_URL = "http://192.168.11.153/StayConnected/API/api/baseURL";
    //for Server
    /**
     * Image Storage Path
     */
    String IMAGE_DIRECTORY = "/DCIM/PICTURES";
    String IMAGE_DIRECTORY_CROP = "/DCIM/CROP_PICTURES";
    String VIDEO_DIRECTORY = "/DCIM/VIDEOS";
    /**
     * Variable For Condition Check
     */
    String DATABASE_NAME = "test.db";
    String TABLENAME="demotest";
    String NAME="name";
    String ID="id";
    String CONTACTEMAIL="contactEmail";
    String ADDRESS="aedress";
    String PHOTO="photo";
    String PROFILELINK="profilelink";

    /**
     * Constant for Intent calling
     */
     int ACTIVITY_RESULT = 1001, ACTIVITY_FINISH = 1002,
            GALLERY = 111, CAMERA = 112, CROP = 113, MY_PERMISSIONS_REQUEST_READ_EXTERNAL_STORAGE = 123;

    /**
     * Validation regular expression
     */
    Pattern EMAIL_ADDRESS_PATTERN = Pattern
            .compile("^([a-zA-Z0-9._-]+)@{1}(([a-zA-Z0-9_-]{1,67})|([a-zA-Z0-9-]+\\.[a-zA-Z0-9-]{1,67}))\\.(([a-zA-Z0-9]{2,6})(\\.[a-zA-Z0-9]{2,6})?)$");
    Pattern MOBILE_NUMBER_PATTERN = Pattern.compile("^[0-9]{10,14}$");
    Pattern LAND_LINE_NUMBER_PATTERN = Pattern.compile("^[0-9]\\d{2,4}-\\d{6,8}$");
    Pattern PERSON_NAME_PATTERN = Pattern.compile("^[A-Za-z\\s]{1,}[\\.]{0,1}[A-Za-z\\s]{0,}$");
    Pattern USER_NAME_PATTERN = Pattern.compile("^([a-zA-Z0-9._-]){6,20}$");
    Pattern PASSWORD_PATTERN = Pattern.compile("^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9]).{8,}$");
    Pattern DATE_PATTERN = Pattern.compile("^\\d{4}\\-(0?[1-9]|1[012])\\-(0?[1-9]|[12][0-9]|3[01])*$");

    //Menu parent items
     int EVENTS=0,FRIENDS=1,NOTIFICATIONS=2,SETTINGS=3,LOGOUT=4;

    //Menu child items
    int MY_EVENTS=0,PARTICIPATING_EVENT=1;


    String FILE_PATH = "file_path";
    String MINE_TYPE = "mimeType";

    /*Time format for 24 hours time to 12 hours*/
    SimpleDateFormat HH_MM_SS = new SimpleDateFormat(
            "HH:mm:ss", Locale.getDefault());
    SimpleDateFormat HH_MM_AM_PM = new SimpleDateFormat(
            "hh:mm a", Locale.getDefault());
    SimpleDateFormat HH_MM = new SimpleDateFormat(
            "HH:mm", Locale.getDefault());

    SimpleDateFormat YYYYMMDD = new SimpleDateFormat(
            "yyyyMMdd", Locale.getDefault());
    SimpleDateFormat YYYYMMDDHHMMSS = new SimpleDateFormat(
            "yyyyMMddHHmmss", Locale.getDefault());

    /*Date format for later ride*/
    SimpleDateFormat MM_DD_YYYY = new SimpleDateFormat(
            "MM-dd-yyyy", Locale.getDefault());
    SimpleDateFormat YYYY_MM_DD = new SimpleDateFormat(
            "yyyy-MM-dd", Locale.getDefault());
    SimpleDateFormat DD_MMM_YYYY = new SimpleDateFormat(
            "dd MMM yyyy", Locale.getDefault());
    SimpleDateFormat DD_MM_YYYY = new SimpleDateFormat(
            "dd-MM-yyyy", Locale.getDefault());


    /**
     * Variable For Condition Check
     */
    String SAVED_PRODUCTS="SavedProducts";
    String PRODUCTS_OFFERS="ProductsOffers";
    String EGYPT="Egypt";
    String SAUDI_ARABIA="Saudi Arabia";
    String EGYPT_ID="1";
    String SAUDI_ARABIA_ID="2";
    String EGB="EGP";
    String SAR="SAR";
    String USD="USD";
    String EGB_ID="1";
    String SAR_ID="2";
    String USD_ID="3";
    String VIEW_ALL="View all";
    String SAVE_IN_THE_DRAFT="Save in the draft";
    String VIEW_ALL_ID="0";
    String SAVE_IN_THE_DRAFT_ID="1";

    /**************************
     * SERVICE NAME START***************************************
     * /**
     * Methods for request on remote server
     */
    String COUNTRY_LIST= "countryList";
    String STATE_LIST = "stateList";
    String CATEGORY_LIST = "categoryList";
    String BRAND_LIST = "brandList";
    String ADD_PRODUCT_COLOR_LIST = "colorList";
    String ADD_PRODUCT_SIZE_LIST = "sizeList";
    String VENDOR_ADD_PRODUCT = "addProduct";
    String VENDOR_CUSTOMER_REVIEW = "getRating";
    String CITY_LIST = "cityList";
    String VENDOR_EDIT_SHOP = "editShop";

    /**************************
     * REQUEST PARAM START***************************************
     * /**
     * Parameter name for request on remote server
     */
    String PN_TITLE="title";

}
