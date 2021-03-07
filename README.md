# algaworks-especialista-spring-rest

github commands

```bash
git checkout -b 19-04-atualizando-o-projeto
git add .
git commit -m "Atualizando o projeto para Spring Boot 2.2 (Spring HATEOAS 1.0)"
git push origin 19-04-atualizando-o-projeto

git checkout master
git merge --no-ff 19-04-atualizando-o-projeto
git push

sair da tela de merge
aperte "ESC" depois digite ":wq"
configure other merge tool
git config --global core.editor "'C:/Program Files/Notepad++/notepad++.exe' -multiInst -notabbar -nosession -noPlugin"

// delete branch locally
git branch -d localBranchName

// delete branch remotely
git push origin --delete remoteBranchName
```