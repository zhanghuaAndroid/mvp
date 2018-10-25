package com.eoffcn.mvpapplication.model.entity;

import java.util.List;

/**
 * @author zhanghua
 * @package com.eoffcn.mvpapplication.model.entity
 * @fileName SongPoetryEntity
 * @date 2018/10/25 10:31
 * @org www.offcn.com
 * @email
 * @description
 */
public class SongPoetryEntity {

    /**
     * code : 200
     * message : 成功!
     * result : [{"title":"句","content":"未离海底千山黑，才到天中万国明。","authors":"宋太祖"},{"title":"登戎州江楼闲望","content":"满目江山四望幽，白云高卷嶂烟收。|日回禽影穿疏木，风递猿声入小楼。|远岫似屏横碧落，断帆如叶截中流。","authors":"幸夤逊"},{"title":"雪","content":"片片飞来静又闲，楼头江上复山前。|飘零尽日不归去，帖破清光万里天。","authors":"幸夤逊"},{"title":"云","content":"因登巨石知来处，勃勃元生绿藓痕。|静即等闲藏草木，动时顷刻遍乾坤。|横天未必朋元恶，捧日还曾瑞至尊。|不独朝朝在巫峡，楚王何事谩劳魂。","authors":"幸夤逊"},{"title":"句  其一","content":"若教作镇居中国，争得泥金在泰山。","authors":"幸夤逊"},{"title":"句  其二","content":"才闻暖律先偷眼，既待和风始展眉。","authors":"幸夤逊"},{"title":"句  其三","content":"嚼处春冰敲齿冷，咽时雪液沃心寒。","authors":"幸夤逊"},{"title":"句  其四","content":"蒙君知重惠琼实，薄起金刀钉玉深。","authors":"幸夤逊"},{"title":"句  其五","content":"深妆玉瓦平无垅，乱拂芦花细有声。","authors":"幸夤逊"},{"title":"句  其六","content":"片逐银蟾落醉觥。","authors":"幸夤逊"}]
     */

    private int code;
    private String message;
    private List<ResultBean> result;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<ResultBean> getResult() {
        return result;
    }

    public void setResult(List<ResultBean> result) {
        this.result = result;
    }


}
