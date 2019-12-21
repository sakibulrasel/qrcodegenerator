package sakibul.srsoftltd.com.qrcodegenerator.helpers.model;

import java.util.List;

import androidx.room.Dao;
import androidx.room.Query;
import io.reactivex.Flowable;
import sakibul.srsoftltd.com.qrcodegenerator.helpers.constant.TableNames;
import sakibul.srsoftltd.com.qrcodegenerator.helpers.util.database.BaseDao;

@Dao

public interface CodeDao extends BaseDao<Code> {
    @Query("SELECT * FROM " + TableNames.CODES)
    Flowable<List<Code>> getAllFlowableCodes();

}
