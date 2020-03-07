# fans
使用java抓取新浪微博大V的粉丝信息

## 新浪微博移动版数据请求url格式
### 1.根据id获取用户信息
    https://m.weibo.cn/profile/info
    参数：
        uid=用户id
### 2.根据用户id获取其粉丝信息，每页返回20条数据，返回数据比较复杂
    https://m.weibo.cn/api/container/getIndex
    参数：
        containerid=231051_-_fans_-_用户id
        since_id=页码
    
## Api
### 1.UserApi类
* 根据用户id获取用户信息
*     User getUserInfo(String id);
* 根据用户名获取用户信息
*     User getUserInfoByName(String name);
* 根据用户id获取用户最近的一条微博
*     Status getLastStatus(String userId);
* 根据用户id获取用户的粉丝数量
*     int getFansCount(String userId);
* 根据用户id和页数返回用户的粉丝信息，每页返回20条数据
*     List<User> getFans(String userId, int page) throws URISyntaxException;
