package com.nowcoder.community.dao;

import com.nowcoder.community.entity.DiscussPost;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DiscussPostMapper {
    //UserId用来支持个人帖子信息查询(动态sql)，offset和limit支持分页，offset是起始行的号，limit是每页数量
    List<DiscussPost> selectDiscussPosts(int userId, int offset, int limit);

    //查询帖子行数,userid用来查询我的主页。
    //如果有动态条件，需要用到参数(<if>中使用)且只有一个参数，需要@Param注解取别名
    int selectDiscussPostRows(@Param("userId") int userId);

}
