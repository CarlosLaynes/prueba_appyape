package pagesObjects;

import base.pageBaseSelenium;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class reservarPage extends pageBaseSelenium {

    public reservarPage(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

    @AndroidFindBy(id = "com.booking:id/bt_accept")
    private MobileElement btn_aceptar;

    @AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc='Desplazarse hacia arriba']")
    private MobileElement btn_x;

    @AndroidFindBy(id = "com.booking:id/facet_search_box_accommodation_destination")
    private MobileElement btn_destino;

    @AndroidFindBy(id = "com.booking:id/facet_with_bui_free_search_booking_header_toolbar_content")
    private MobileElement txt_destino;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Cuzco')]")
    private MobileElement btn_cuzco;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc='14 febrero 2023']")
    private MobileElement btn_ida;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc='28 febrero 2023']")
    private MobileElement btn_vuelta;

    @AndroidFindBy(id = "com.booking:id/facet_date_picker_confirm")
    private MobileElement btn_fechas;

    @AndroidFindBy(id = "com.booking:id/facet_search_box_accommodation_occupancy")
    private MobileElement btn_personas;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.view.ViewGroup[3]/android.widget.LinearLayout/android.widget.Button[2]")
    private MobileElement btn_mas;

    @AndroidFindBy(id = "android:id/button1")
    private MobileElement btn_ok;

    @AndroidFindBy(id = "com.booking:id/group_config_apply_button")
    private MobileElement btn_aplicar;

    @AndroidFindBy(id = "com.booking:id/facet_search_box_cta")
    private MobileElement btn_buscar;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'JW Marriott El Convento Cusco')]")
    private MobileElement btn_item;

    @AndroidFindBy(id = "com.booking:id/select_room_cta")
    private MobileElement btn_habitacion;

    @AndroidFindBy(id = "com.booking:id/recommended_block_reserve_button")
    private MobileElement btn_reservar;


    public void clickAceptar(){ click(this.btn_aceptar);}
    public void clickX(){ click(this.btn_x);}
    public void clickDestino(){ click(this.btn_destino);}
    public void insertDestino(String destino){ sendText(this.txt_destino, destino);}
    public void clickCuzco(){ click(this.btn_cuzco);}

    public void clickIda(){ click(this.btn_ida);}

    public void clickVuelta(){ click(this.btn_vuelta);}

    public void clickFechas(){ click(this.btn_fechas);}

    public void clickPersonas(){ click(this.btn_personas);}

    public void clickMas(){ click(this.btn_mas);}

    public void clickOk(){ click(this.btn_ok);}

    public void clickAplicar(){ click(this.btn_aplicar);}

    public void clickBuscar(){ click(this.btn_buscar);}

    public void clickItem(){ click(this.btn_item);}

    public void clickHabitacion(){ click(this.btn_habitacion);}

    public void clickReservar(){ click(this.btn_reservar);}

}
