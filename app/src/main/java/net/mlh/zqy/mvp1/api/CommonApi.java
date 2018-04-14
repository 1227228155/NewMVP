package net.mlh.zqy.mvp1.api;

import net.mlh.zqy.mvp1.bean.BookBean;

import io.reactivex.Observable;
import retrofit2.http.GET;

/**
 * Created by Administrator on 2017/4/9 0009.
 */

public interface CommonApi {


    @GET(Url.BOOK_CLASSIFY)
    Observable<BookBean> bookClassify();


   /* *//**
     * 注册用户
     *
     * @return
     *//*
    @FormUrlEncoded
    @POST("veri")
    Observable<RegisterBean> registerUser(@Field("mobile") String userPhone);


    *//**
     * 根据歌曲名字或者歌手搜索歌曲列表
     * @param name
     * @return
     *//*
   @GET("audioInfo")
   Observable<FindBgmBean> findBgm(@Query("field") String name);

    *//**
     * 根据歌曲信息的Hash请求地址
     * @param hash
     * @return
     *//*
    @GET("hashAudio")
    Observable<FindBgmPlayBean> findBgmPlay(@Query("hash") String hash);


    *//**
     *
     * @param   map
     * @return  获得世界fragment推荐页面的数据
     *//*
    @FormUrlEncoded
    @POST("topCarousel")
    Observable<WorldBean> getWorld(@FieldMap Map<String, String> map);
    *//**
     *
     * @param   map
     * @return  获得世界fragment世界页面的数据
     *//*
    @FormUrlEncoded
    @POST("topCarousel")
    Observable<Videobean> getWorld2(@FieldMap Map<String, String> map);

   *//**
     * 关注和取消关注
     * @return
     *//*
    @FormUrlEncoded
    @POST("userAttenStatus")
    Observable<CodeBean> getFollowStatus(@FieldMap Map<String, String> map);

    *//**
     * 获得关注页面信息
     * @return
     *//*
    @FormUrlEncoded
    @POST("userAtten")
    Observable<FollowBean> getFollow(@FieldMap Map<String, String> map);

    *//**
     * 获得关注列表或者粉丝列表
     * @return
     *//*
    @FormUrlEncoded
    @POST("userAttenInfo")
    Observable<FansListBean> getFollowList(@FieldMap Map<String, String> map);

    *//**
     * 点赞  观看  分享  统计接口
     * @return
     *//*
    @FormUrlEncoded
    @POST("videoTimes")
    Observable<Code> getVideoTimes(@FieldMap Map<String, String> map);

    *//**
     * 用户添加收藏接口
     * @return
     *//*
    @FormUrlEncoded
    @POST("userCollection")
    Observable<Code> getCollection(@FieldMap Map<String, String> map);
 *//**
  * 用户查看收藏页面
  * @return
  *//*
    @FormUrlEncoded
    @POST("userCollectionInfo")
    Observable<FollowBean> getCollectionInfo(@FieldMap Map<String, String> map);
*//**
 * 获取用户评论数据
 * @return
 *//*
    @FormUrlEncoded
    @POST("userWatchVideo")
    Observable<CommentBean> getComment(@FieldMap Map<String, String> map);

    *//**
     * 获取用户评论二级回复数据
     * @return
     *//*
    @FormUrlEncoded
    @POST("userWatchVideo")
    Observable<ReplyBean> getReply(@FieldMap Map<String, String> map);
    *//**
     * 用户评论
     * @return
     *//*
    @FormUrlEncoded
    @POST("userComment")
    Observable<SendComment> sendComment(@FieldMap Map<String, String> map);
    *//**
     * 用户回复
     * @return
     *//*
    @FormUrlEncoded
    @POST("userComment")
    Observable<SendReply> sendReply(@FieldMap Map<String, String> map);
    *//**
     * 用户二级回复
     * @return
     *//*
    @FormUrlEncoded
    @POST("userComment")
    Observable<ThirdReply> sendReply2(@FieldMap Map<String, String> map);
    *//**
     * 更换用户绑定手机号
     * @return
     *//*
    @FormUrlEncoded
    @POST("userMobChange")
    Observable<CodeBean> updatePhone(@FieldMap Map<String, String> m);


    *//**
     * 举报接口
     * @return
     *//*
    @Multipart
    @POST("report")
    Observable<CodeBean> report(@Part List<MultipartBody.Part> partList);
    *//**
     * 上传接口
     * @return
     *//*
    @FormUrlEncoded
    @POST("videoAddress")
    Observable<UpdateBean> update(@FieldMap Map<String, String> m);
    *//**
     * 上传背景图片接口
     * @return
     *//*
    @Multipart
    @POST("userWall")
    Observable<BgBean> uploadBg(@Part List<MultipartBody.Part> partList);

    *//**
     * 人气榜接口
     * @return
     *//*
    @FormUrlEncoded
    @POST("vidoePopHot")
    Observable<HotBean> getHot(@FieldMap Map<String, String> m);
    *//**
     * 人气视频榜接口
     * @return
     *//*
    @FormUrlEncoded
    @POST("vidoePopHot")
    Observable<HotVideoBean> getHotVideo(@FieldMap Map<String, String> m);
    *//**
     * 个人作品接口
     * @return
     *//*
    @FormUrlEncoded
    @POST("uservideo")
    Observable<UserWorksBean> getUserWorks(@FieldMap Map<String, String> m);*/
}
