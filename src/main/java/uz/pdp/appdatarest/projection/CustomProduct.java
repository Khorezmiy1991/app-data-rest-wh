package uz.pdp.appdatarest.projection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appdatarest.entity.*;

@Projection(types = Product.class)
public interface CustomProduct {

    Integer getId();

    String getName();

    boolean isActive();

    Category getCategory();

    Attachment getAttachment();

    Measurement getMeasurement();

    String getCode();



    // Bu variyant ishlamadi
   /* @Value("#{target.category.id}")
    Integer getCategoryId();

    @Value("#{target.photo.id}")
    Integer getPhotoId();

    @Value("#{target.measurement.id}")
    Integer getMeasurementId();*/

}
