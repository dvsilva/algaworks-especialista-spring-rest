# algaworks-especialista-spring-rest

github commands

```bash
git checkout -b 02-20-mudando-comportamento-com-profiles
git add .
git commit -m "Mudando o comportamento da aplicação com Spring Profiles"
git push origin 02-20-mudando-comportamento-com-profiles

git checkout master
git merge --no-ff 02-20-mudando-comportamento-com-profiles
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