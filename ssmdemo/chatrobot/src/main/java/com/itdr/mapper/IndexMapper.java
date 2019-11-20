package com.itdr.mapper;

import com.itdr.pojo.ReplyContent;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * ClassName: IndexMapper
 * 日期: 2019/11/4 9:42
 *
 * @author Air张
 * @since JDK 1.8
 */
public interface IndexMapper {
    // 遵循四个原则
//1.接口中的方法名和映射文件中 id 名相同
//2.接口中传参类型与映射文件中传参类型要一致
//3.接口中返回值类型与映射文件中返回值类型要一致
//4.映射文件中命名空间与绑定接口绑定

    String getDefaultReply();

    String getAutoReply();

    List<String> getReplyByKeyWord(String keyword);

    List<String> getReplyByWords(String wordss);

    List<ReplyContent> getAll();

    int addOne(ReplyContent replyContent);

    int deleteOne(Integer id);

//    List<String> getReply(@Param("keyword") String keyword, @Param("words") String words);
}
