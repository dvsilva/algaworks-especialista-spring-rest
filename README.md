# algaworks-especialista-spring-rest

github commands

```bash
git checkout -b 18-17-desacoplando-anotacoes-do-swagger-dos-controladores
git add .
git commit -m "Desacoplando anotações do Swagger dos controladores"
git push origin 18-17-desacoplando-anotacoes-do-swagger-dos-controladores

git checkout master
git merge --no-ff 18-17-desacoplando-anotacoes-do-swagger-dos-controladores
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