# algaworks-especialista-spring-rest

github commands

```bash
git checkout -b 20-11-implementando-o-versionamento-da-api-por-media-type
git add .
git commit -m "Implementando o versionamento da API por Media Type"
git push origin 20-11-implementando-o-versionamento-da-api-por-media-type

git checkout master
git merge --no-ff 20-11-implementando-o-versionamento-da-api-por-media-type
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