# algaworks-especialista-spring-rest

github commands

```bash
git checkout -b 20-07-o-que-e-e-quando-versionar-uma-api
git add .
git commit -m "O que é e quando versionar uma API?"
git push origin 20-07-o-que-e-e-quando-versionar-uma-api

git checkout master
git merge --no-ff 20-07-o-que-e-e-quando-versionar-uma-api
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