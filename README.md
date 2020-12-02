# algaworks-especialista-spring-rest

github commands

```bash
git checkout -b 03-14-conhecendo-e-implementando-padrao-repository
git add .
git commit -m "Conhecendo e implementando o padrão Repository"
git push origin 03-14-conhecendo-e-implementando-padrao-repository

git checkout master
git merge --no-ff 03-14-conhecendo-e-implementando-padrao-repository
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