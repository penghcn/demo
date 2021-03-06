# git使用
[原文地址](https://github.com/penghcn/start/tree/master/git)

## 1、安装配置
### 查看配置，系统、用户、某项目本地仓库
    git config --system  --list
    git config --global  --list
    git config --local  --list

### 设置本地用户
    git config --global user.name "pengh-mbp"
    git config --global user.email "peng@test.com"

### .gitignore 配置参考
请特别注意，一定要配置.gitignore文件，配置参考 [gitignore.sample](./gitignore.sample)

### 换行符
团队统一规范代码的换行符为类UNIX格式，即LF

windows、mac系统都请配置

    ## 提交时转换为LF，检出时不转换
    ## 拒绝提交包含混合换行符的文件
    git config --global core.autocrlf input
    git config --global core.safecrlf true

eclipse、idea等ide开发工具配置换行符为LF，请自行百度谷歌，谢谢

mac下可以使用dos2unix批量转换某目录下的文件换行符为LF

    brew install dos2unix

    cd /target
    find . -name '*' -exec dos2unix {} \;

    或者只是转换指定的后缀文件
    find . -name '*.java' -exec dos2unix {} \;
    find . -name '*.xml' -exec dos2unix {} \;
    find . -name '*.pro*ies' -exec dos2unix {} \;

windows的git命令行工具也自带dos2unix，同样可以使用上面(或下面)命令，来转换当前目录下的所有文件，换行符改为LF

    find . -type f -exec dos2unix {} \;

## 2、简单使用
详见这里[get-start.md](./get-start.md)

## 3、git flow开发流
<del>详见这里[git-flow.md](./git-flow.md)</del>

详见这里[github-flow.md](./github-flow.md)

## 4、git merge合并与冲突解决
详见这里[git-merge.md](./git-merge.md)

## 5、简单回退
详见这里[git-reset.md](./git-reset.md)

## 提醒
    1、请大家仔细阅读上面相关文章，或自行熟悉使用git
    2、项目开始开发前，先pull同步最新的代码到本地，再开始开发
    3、对开发中的项目，最好每个功能点先提交到本地仓库，也可以同时同步到远程仓库。不要一次累计大量修改的代码再提交
    4、多人合作的项目分支，建议每天上班前同步合并下其他人的代码，下班前提交合并一下自己的代码


